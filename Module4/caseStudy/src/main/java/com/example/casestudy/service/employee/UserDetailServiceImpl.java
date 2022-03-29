package com.example.casestudy.service.employee;

import com.example.casestudy.model.employee.MyUserDetail;
import com.example.casestudy.model.user.User;

import com.example.casestudy.repository.employee.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByName(username);
        if (user==null){
            throw new UsernameNotFoundException("User name " + username + "Not found!");
        }
        return new MyUserDetail(user);




//        User user = this.appUserDAO.findUserAccount(userName);
//
//        if (user == null) {
//            System.out.println("User not found! " + username);
//            throw new UsernameNotFoundException("User " + username + " was not found in the database");
//        }
//
//        System.out.println("Found User: " + user);
//
//        // [ROLE_USER, ROLE_ADMIN,..]
//        List<String> roleNames = this.appRoleDAO.getRoleNames(appUser.getUserId());
//
//        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
//        if (roleNames != null) {
//            for (String role : roleNames) {
//                // ROLE_USER, ROLE_ADMIN,..
//                GrantedAuthority authority = new SimpleGrantedAuthority(role);
//                grantList.add(authority);
//            }
//        }
//
//        UserDetails userDetails = (UserDetails) new User(appUser.getUserName(), //
//                appUser.getEncrytedPassword(), grantList);
//
//        return userDetails;
    }
}
