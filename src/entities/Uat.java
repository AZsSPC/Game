package entities;

import static clas.Init.Enum;
import static clas.Init.UatStr;

public class Uat {

 public Uat(String name, int id, String sid, String texture) {
  Name = name;
  ID = id;
  StringID = sid;
  Texture = texture;
  System.out.println("Name:{" + Name + "},ID:{" + ID + "},SID:{" + StringID + "},Texture:{" + Texture + "}");
  UatStr[Enum] = Texture ;
  Enum++;
 }

 public static void setPos() {

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
