package entities;
import static clas.Init.Enum;
import static clas.Init.UatLit;

public class Uat{

 public Uat(String name, int id, String sid, String texture){
  UatLit[Enum][0] = name;
  UatLit[Enum][1] = id;
  UatLit[Enum][2] = sid;
  UatLit[Enum][3] = texture;
  Enum++;
  //System.out.println("Name:{" + name + "},ID:{" + id + "},SID:{" + sid + "},Texture:{" + texture + "}");
 }

 public static String GetTexture(int id){
  return UatLit[id][3] + "";
 }

 public static String IW(String s){
  return "src/images/" + s + ".png";
 }
 static private String Name;
 static private Integer ID;
 static private String StringID;
 static private int[] Pos = new int[2];
 static private String Texture = IW("null");

}
