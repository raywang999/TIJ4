//: reusing/SprinklerSystem.java
// Composition for code reuse.
/*
Exercise 1: (2) Analyze SprinklerSystem.toString( )
in reusing/SprinklerSystem.java to discover whether writing the toString( )
with an explicit StringBuilder will save any StringBuilder creations.
 */
class WaterSource {
  private String s;
  WaterSource() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  public String toString() { return s; }
}	

public class SprinklerSystem1{
  private String valve1, valve2, valve3, valve4;
  private WaterSource source = new WaterSource();
  private int i;
  private float f;
  public String toString() {
      /*
    return
      "valve1 = " + valve1 + " " +
      "valve2 = " + valve2 + " " +
      "valve3 = " + valve3 + " " +
      "valve4 = " + valve4 + "\n" +
      "i = " + i + " " + "f = " + f + " " +
      "source = " + source;
      */
      StringBuilder result = new StringBuilder("valve1 = ");
      result.append(valve1);
      result.append(" ");
      result.append("valve2 = ");
      result.append(valve2);
      result.append(" ");
      result.append("valve3 = ");
      result.append(valve3);
      result.append(" ");
      result.append("valve4 = ");
      result.append(valve4);
      result.append("\n");
      result.append("i = ");
      result.append(i);
      result.append(" ");
      result.append("f = ");
      result.append(f);
      result.append(" ");
      result.append("source = ");
      result.append(source);
      return
              result.toString();
  }	
  public static void main(String[] args) {
    SprinklerSystem1 sprinklers = new SprinklerSystem1();
    System.out.println(sprinklers);
  }
} /* Output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*///:~

/*
results of :
javap -c SprinklerSystem1.class:


Compiled from "SprinklerSystem1.java"
public class SprinklerSystem1 {
  public SprinklerSystem1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #2                  // class WaterSource
       8: dup
       9: invokespecial #3                  // Method WaterSource."<init>":()V
      12: putfield      #4                  // Field source:LWaterSource;
      15: return

  public java.lang.String toString();
    Code:
       0: new           #5                  // class java/lang/StringBuilder
       3: dup
       4: invokespecial #6                  // Method java/lang/StringBuilder."<init>":()V
       7: ldc           #7                  // String valve1 =
       9: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      12: aload_0
      13: getfield      #9                  // Field valve1:Ljava/lang/String;
      16: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: ldc           #10                 // String  valve2 =
      21: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: aload_0
      25: getfield      #11                 // Field valve2:Ljava/lang/String;
      28: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      31: ldc           #12                 // String  valve3 =
      33: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: aload_0
      37: getfield      #13                 // Field valve3:Ljava/lang/String;
      40: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      43: ldc           #14                 // String  valve4 =
      45: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      48: aload_0
      49: getfield      #15                 // Field valve4:Ljava/lang/String;
      52: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      55: ldc           #16                 // String \ni =
      57: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: aload_0
      61: getfield      #17                 // Field i:I
      64: invokevirtual #18                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      67: ldc           #19                 // String  f =
      69: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      72: aload_0
      73: getfield      #20                 // Field f:F
      76: invokevirtual #21                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      79: ldc           #22                 // String  source =
      81: invokevirtual #8                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      84: aload_0
      85: getfield      #4                  // Field source:LWaterSource;
      88: invokevirtual #23                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      91: invokevirtual #24                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      94: areturn

  public static void main(java.lang.String[]);
    Code:
       0: new           #25                 // class SprinklerSystem1
       3: dup
       4: invokespecial #26                 // Method "<init>":()V
       7: astore_1
       8: getstatic     #27                 // Field java/lang/System.out:Ljava/io/PrintStream;
      11: aload_1
      12: invokevirtual #28                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      15: return
}

########################################################################


results of the new SprinklerSystem1.class:


Compiled from "SprinklerSystem1.java"
public class SprinklerSystem1 {
  public SprinklerSystem1();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #2                  // class WaterSource
       8: dup
       9: invokespecial #3                  // Method WaterSource."<init>":()V
      12: putfield      #4                  // Field source:LWaterSource;
      15: return

  public java.lang.String toString();
    Code:
       0: new           #5                  // class java/lang/StringBuilder
       3: dup
       4: ldc           #6                  // String valve1 =
       6: invokespecial #7                  // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
       9: astore_1
      10: aload_1
      11: aload_0
      12: getfield      #8                  // Field valve1:Ljava/lang/String;
      15: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      18: pop
      19: aload_1
      20: ldc           #10                 // String
      22: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      25: pop
      26: aload_1
      27: ldc           #11                 // String valve2 =
      29: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_1
      34: aload_0
      35: getfield      #12                 // Field valve2:Ljava/lang/String;
      38: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      41: pop
      42: aload_1
      43: ldc           #10                 // String
      45: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      48: pop
      49: aload_1
      50: ldc           #13                 // String valve3 =
      52: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: aload_0
      58: getfield      #14                 // Field valve3:Ljava/lang/String;
      61: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      64: pop
      65: aload_1
      66: ldc           #10                 // String
      68: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      71: pop
      72: aload_1
      73: ldc           #15                 // String valve4 =
      75: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload_1
      80: aload_0
      81: getfield      #16                 // Field valve4:Ljava/lang/String;
      84: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      87: pop
      88: aload_1
      89: ldc           #17                 // String \n
      91: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: aload_1
      96: ldc           #18                 // String i =
      98: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     101: pop
     102: aload_1
     103: aload_0
     104: getfield      #19                 // Field i:I
     107: invokevirtual #20                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     110: pop
     111: aload_1
     112: ldc           #10                 // String
     114: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     117: pop
     118: aload_1
     119: ldc           #21                 // String f =
     121: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     124: pop
     125: aload_1
     126: aload_0
     127: getfield      #22                 // Field f:F
     130: invokevirtual #23                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
     133: pop
     134: aload_1
     135: ldc           #10                 // String
     137: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     140: pop
     141: aload_1
     142: ldc           #24                 // String source =
     144: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     147: pop
     148: aload_1
     149: aload_0
     150: getfield      #4                  // Field source:LWaterSource;
     153: invokevirtual #25                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     156: pop
     157: aload_1
     158: invokevirtual #26                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     161: areturn

  public static void main(java.lang.String[]);
    Code:
       0: new           #27                 // class SprinklerSystem1
       3: dup
       4: invokespecial #28                 // Method "<init>":()V
       7: astore_1
       8: getstatic     #29                 // Field java/lang/System.out:Ljava/io/PrintStream;
      11: aload_1
      12: invokevirtual #30                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
      15: return
}
 */
