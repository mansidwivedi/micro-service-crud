package com.userinfo.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Account")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;
    
    @Column(name="balance")
    private Long balance;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private UserEntity user;
    @JoinColumn(name="user_id")
    

	
//	 public Long getId1() {
//			return user_id;
//		}
//
//		public void setId2(Long user_id) {
//			this.user_id = user_id;
//		}
//		
	public Long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}	
	  @Override
	    public String toString() {
	        return "AccountEntity [id=" + account_id + ", balance=" + balance + 
	                "]";
	  }
}