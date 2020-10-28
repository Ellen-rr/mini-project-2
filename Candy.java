/*
@author Mengying Yu
@version 10/22/2020

*/
//new class called candy
class Candy {
  private String name;//private class

//defalut constructor
  Candy() {
    name = "";
  }
//2nd constructor 
//@param aName is the name we want to set 
  Candy(String aName) {
    name = aName;
  }

//mutator
  void setName(String theName) {
    name = theName;
  }

//accessor
//@return the name of the candy
  String getName() {
    return name;
  }
//print candy's name
  void print() {
    System.out.println(name);
  }




}




