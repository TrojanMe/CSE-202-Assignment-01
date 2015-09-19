public class Room {


    private

    String hallName ;
    int roomNo ;
    boolean status ;



    public String getHallName()
    {
        return hallName;
    }
    public void setHallName(String hall)
    {
        hallName = hall;
    }



    public int getRoomNo()
    {
        return roomNo;
    }
    public void setRoomNo(int r)
    {
        roomNo = r;
    }




    public boolean getStatus()
    {
        return status;
    }

    public void setStatus(boolean b)
    {
        status = b;
    }



    public Room() { }
    public Room(String hall_new,int r_new)
    {
        hallName = hall_new;
        roomNo = r_new;
        status = false;
    }




    public void print()  {

        if (status == false )
            System.out.println("Room No , "+ getRoomNo() + "  of  "+ getHallName() + " is currently available for allotment. ");
        else
            System.out.println("Room No , "+ getRoomNo() + "  of  "+ getHallName() + " is alloted.");

    }



};


