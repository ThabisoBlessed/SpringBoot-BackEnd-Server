package model;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name="Users")//not user  ,user is a reserved word
public class User {

@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	

@Column(name="username",unique=true ,nullable =false,length=100)
private String username;


@Column(name="password" ,nullable =false,length=100)
private String password;

@Column(name="name",nullable =false,length=100)
private String name;


@Column(name="createTime",nullable =false)

private LocalDateTime createTime;

@Enumerated(EnumType.STRING)
@Column(name="role",nullable =false)
private Role role;





}