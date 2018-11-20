package com.vega.springit.domain;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;
import java.util.stream.Collectors;

@Entity
@NoArgsConstructor
@Getter @Setter
@RequiredArgsConstructor
public class User implements UserDetails {

    @Id @GeneratedValue
    private Long id;

    @NonNull
    @Size(min = 8, max = 20)
    @Column(nullable = false, unique = true)
    private String email;

    @NonNull
    @Column(length = 100)
    private String password;

    @NonNull
    @Column(nullable = false)
    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();

    // NEW STUFF

    @NonNull
    @NotNull(message = "You must enter a first name.")
    private String firstName;

    @NonNull
    @NotNull(message = "You must enter a lastName name.")
    private String lastName;

    @Transient
    @Setter(AccessLevel.NONE)
    private String fullName;

    @NonNull
    @NotNull
    private String alias;

    public String getFullName(){
        return firstName + " " + lastName;
    }

    // NEW STUFF

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void addRoles(Set<Role> roles) {
        roles.forEach(this::addRole);
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
