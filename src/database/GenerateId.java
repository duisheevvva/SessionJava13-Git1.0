package database;

public class GenerateId {
    public static Long hospitalId=0L;
    public static Long departmentId=0L;
    public static Long doctorId=0L;

    public static Long generateHosId(){
      return  ++hospitalId;
    }
    public static Long generateDepId(){
      return  ++departmentId;
    }
    public static Long generateDocId(){
      return  ++doctorId;
    }

}
