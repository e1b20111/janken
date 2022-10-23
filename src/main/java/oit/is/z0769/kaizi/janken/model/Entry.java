package oit.is.z0769.kaizi.janken.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Entry {
  ArrayList<String> users = new ArrayList<>();
  String myname;
  int numuser = 0;

  public void addUser(String name) {
    this.numuser++;
    // 同名のユーザが居たら何もせずにreturn
    for (String s : this.users) {
      if (s.equals(name)) {
        this.numuser--;
        return;
      }
    }
    // 同名のユーザが居なかった場合はusersにnameを追加する
    this.users.add(name);

    setMyName(name);
  }

  public ArrayList<String> getUsers() {
    return users;
  }

  public void setUsers(ArrayList<String> users) {
    this.users = users;
  }

  public String getMyName() {
    return myname;
  }

  public void setMyName(String name) {
    this.myname = name;
  }

  public int getNumUser() {
    return numuser;
  }

  public void setNumUser(int numuser) {
    this.numuser = numuser;
  }

}
