package entities;

import clas.Init;
import static clas.Init.Enum;
import static clas.Init.UatBaseList;

public class Uat {

 public Uat(String name, int id, String sid, String texture) {
  UatBaseList[Enum][0] = name;
  UatBaseList[Enum][1] = id;
  UatBaseList[Enum][2] = sid;
  UatBaseList[Enum][3] = texture;
  Enum++;
  //System.out.println("Name:{" + name + "},ID:{" + id + "},SID:{" + sid + "},Texture:{" + texture + "}");
 }

 public static String GetTexture(int id) {
  return UatBaseList[id][3] + "";
 }

 public static String IW(String s) {
  return "src/images/" + s + ".png";
 }
 static private String Name;
 static private Integer ID;
 static private String StringID;
 static private int[] Pos = new int[2];
 static private String Texture = IW("null");

}
