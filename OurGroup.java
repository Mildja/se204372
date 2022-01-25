import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("น.ส.วีรยา ศรีรุจิเมธาก 6220504780"); //PUT YOUR NAME HERE
        groupMembers.add("น.ส.อธิติยา จำเหล่ 6220502191"); //PUT YOUR NAME HERE
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}