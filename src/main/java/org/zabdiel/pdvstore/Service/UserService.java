package org.zabdiel.pdvstore.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zabdiel.pdvstore.Entity.Hierarchy;
import org.zabdiel.pdvstore.Entity.Usuarios;
import org.zabdiel.pdvstore.Repository.UserRepository;

import java.util.ArrayList;


@Service("userDetailsService")
@Slf4j
public class UserService implements UserDetailsService {


    @Autowired
    private UserRepository userRepository;

    //
    //Se obtiene el obejto usuario filtado por username


    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuarios users = userRepository.findByUsername(username);

        if(users == null){
            throw new UsernameNotFoundException(username);
        }
        //Se envuelven los roles
        //var hierachy = new ArrayList<GrantedAuthority>();
        ArrayList<GrantedAuthority> hierachy = new ArrayList<>();
        //Se recorre la jerarquia
        for(Hierarchy hie: users.getHierarchyList()){
            //se envuelve en simple grand
            hierachy.add(new SimpleGrantedAuthority(hie.getNombre_rol()));
        }
        //devuleve un objetos recuperados
        return new User(users.getUsername(), users.getPassword(), hierachy);
    }

}
