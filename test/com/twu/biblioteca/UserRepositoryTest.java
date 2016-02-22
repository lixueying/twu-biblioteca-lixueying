package com.twu.biblioteca;

import com.twu.biblioteca.User.User;
import com.twu.biblioteca.User.UserRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/2/22.
 */
public class UserRepositoryTest {
    private UserRepository userRepository;
    private ArrayList<User> usersId;
    private ArrayList<User> usersInformation;

    @Before
    public void setUp(){
        userRepository = new UserRepository();
        usersId = new ArrayList<User>();
        usersInformation = new ArrayList<User>();
    }

    @Test
    public void should_return_userId_list_size_3(){
        usersId = userRepository.usersId();
        assertThat(usersId.size(), is(3));
    }

    @Test
    public void should_return_usersInformation_list_size_3(){
        usersInformation = userRepository.usersInformation();
        assertThat(usersInformation.size(), is(3));
    }

    @Test
    public void should_return_userId_list_first_user_id_000_0001(){
        usersId = userRepository.usersId();
        assertThat(usersId.get(0).getNumber(), is("000-0001"));
    }

    @Test
    public void should_return_usersInformation_list_first_user_name_shawn(){
        usersInformation = userRepository.usersInformation();
        assertThat(usersInformation.get(0).getName(), is("shawn"));
    }
}
