
public class Student {

    private

    String studentName;
    String studentNo;
    Room room;



    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room r)
    {
        room = r;
    }




    public String getStudentName()
        {
        return studentName ;
        }
    public void setStudentName(String s)
        {
        studentName = s ;
        }



    public String getStudentNo()
        {
            return studentNo ;
        }

    public void setStudentNo(String n)
        {
        studentNo = n ;

        }



    public Student() {}
    public Student(String s, String n , Room r)
    {
        studentName = s ;
        studentNo = n ;
        room = r;
    }



    public void print() {

        System.out.println( "Student No:" + getStudentNo() + "," + getStudentName() + "," + "resides on" + " " + room.getHallName() + "," + "Room No" + "," +  room.getRoomNo() ) ;

    }

}
