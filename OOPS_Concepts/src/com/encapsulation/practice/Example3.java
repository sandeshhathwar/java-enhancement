/*
 * 
 */
package com.encapsulation.practice;

/**
 * @author Suhas
 *14-May-2020 8:49:31 am
 */
class Example3{
    Member member;
    public Example3(Member member) {  // who is in this Team?
        this.member = member;  //  this 'member' is in this Team!
    }
 
    public static void main(String[] args) {
       Member myMember = new Member("Sandesh", "light", 10, 1); 
       Example3 myTeam = new Example3(myMember); // success! Sandesh now belongs to a team!
       System.out.println(myTeam.member.getName());
       System.out.println(myTeam.member.getType());
       System.out.println(myTeam.member.getLevel());
       System.out.println(myTeam.member.getRank());
    }
}
 
class Member {
    private String name;
    private String type;
    private int level;
    private int rank;
 
    public Member(String name, String type, int level, int rank) {
        this.name = name; 
        this.type = type;
        this.level = level;
        this.rank = rank;
    }
 
    public String getName() {
    	return this.name;
    }
 
    public String getType() {
    	return this.type;
    }
 
    public int getLevel() {
    	return this.level;
    }
 
    public int getRank() {
    	return this.rank;
    }
}

