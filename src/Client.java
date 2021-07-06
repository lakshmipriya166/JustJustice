
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.JOptionPane;


/**
 *
 * @author Lakshmi Priya
 */
public class Client extends Person implements Comparable<Client>
{
    private String osno, cno;
    private String fname;
    private long iano, ccno;
    private String usec;
    private String addr;
    private String paddr;
    
    public Client(){} 
      
    public Client(String osno, String fname, long iano, String usec, String addr, String paddr)
    {
        this.osno=osno;
        this.fname=fname;
        this.iano=iano;
        this.usec=usec;
        this.addr=addr;
        this.paddr=paddr;
    }
    
    public Client(String cno, String fname, String usec, long ccno, String addr, String paddr)
    {
        this.cno=cno;
        this.fname=fname;
        this.ccno=ccno;
        this.usec=usec;
        this.addr=addr;
        this.paddr=paddr;
    }

    Client(String osno, String name, String fname, long iano, String usec, String mno, String email, String addr, String paddr) {
        super(name,mno,email);
        this.osno=osno;
        this.fname=fname;
        this.iano=iano;
        this.usec=usec;
        this.addr=addr;
        this.paddr=paddr;
        
    }
    
    void setOsno(String osno){
        this.osno=osno;
    }
    
    void setCno(String cno){
        this.cno=cno;
    }
    
    void setFname(String fname){
        this.fname=fname;
    }
    
    void setIano(Long iano){
        this.iano=iano;
    }
    
    void setCcno(Long ccno){
        this.ccno=ccno;
    }
    
    void setUsec(String usec){
        this.usec=usec;
    }
    
    void setAddr(String addr){
        this.addr=addr;
    }
    
    void setPaddr(String paddr){
        this.paddr=paddr;
    }
    
    String getOsno(){
        return osno;
    }
    
    String getCno(){
        return cno;
    }
    
    String getFname(){
        return fname;
    }
    
    Long getIano(){
        return iano;
    }
    
    Long getCcno(){
        return ccno;
    }
    
    String getUsec(){
        return usec;
    }
    
    String getAddr(){
        return addr;
    }
    
    String getPaddr(){
        return paddr;
    }
    
    public void addCriminalClientDetail(){
        try{
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/JustJustice","root","admin123");
        Statement s=(Statement)con.createStatement();

        String r="insert into cdet_cr values('"+getCno()+"','"+getName()+"','"+getFname()+"','"+getCcno()+"','"+getUsec()+"','"+getMno()+"','"+getEmail()+"','"+getAddr()+"','"+getPaddr()+"');";

        s.executeUpdate(r);
        JOptionPane.showMessageDialog(null,"Client detail added!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public void addCivilClientDetail(){
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/JustJustice","root","admin123");
            Statement s=(Statement)con.createStatement();
            
            String r="insert into cdet_ci values('"+getOsno()+"','"+getName()+"','"+getFname()+"','"+getIano()+"','"+getUsec()+"','"+getMno()+"','"+getEmail()+"','"+getAddr()+"','"+getPaddr()+"');";
            
            s.executeUpdate(r);
            JOptionPane.showMessageDialog(null,"Client detail added!");
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());            
        }
    }
    
    public void alterCivilClientDetail(){
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/JustJustice","root","admin123");
            Statement s=(Statement)con.createStatement();

            String q="update cdet_ci set cname ='"+getName()+"' where osno='"+getOsno()+"';";
            String r="update cdet_ci set fname ='"+getFname()+"' where osno='"+getOsno()+"';";
            String b="update cdet_ci set iano ='"+getIano()+"' where osno='"+getOsno()+"';";
            String t="update cdet_ci set usec ='"+getUsec()+"' where osno='"+getOsno()+"';";
            String u="update cdet_ci set mno ='"+getMno()+"' where osno='"+getOsno()+"';";
            String v="update cdet_ci set email ='"+getEmail()+"' where osno='"+getOsno()+"';";
            String w="update cdet_ci set addr ='"+getAddr()+"' where osno='"+getOsno()+"';";
            String x="update cdet_ci set paddr ='"+getPaddr()+"' where osno='"+getOsno()+"';";
            s.executeUpdate(q);
            s.executeUpdate(r);
            s.executeUpdate(b);
            s.executeUpdate(t);
            s.executeUpdate(u);
            s.executeUpdate(v);
            s.executeUpdate(w);
            s.executeUpdate(x);

            JOptionPane.showMessageDialog(null,"Client detail Updated!");

        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());

        }
    }
    
    public void alterCriminalClientDetail(){
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/JustJustice","root","admin123");
            Statement s=(Statement)con.createStatement();

            String q="update cdet_cr set cname ='"+getName()+"' where cno='"+getCno()+"';";
            String r="update cdet_cr set fname ='"+getFname()+"' where cno='"+getCno()+"';";
            String b="update cdet_cr set ccno ='"+getCcno()+"' where cno='"+getCno()+"';";
            String t="update cdet_cr set usec ='"+getUsec()+"' where cno='"+getCno()+"';";
            String u="update cdet_cr set mno ='"+getMno()+"' where cno='"+getCno()+"';";
            String v="update cdet_cr set email ='"+getEmail()+"' where cno='"+getCno()+"';";
            String w="update cdet_cr set addr ='"+getAddr()+"' where cno='"+getCno()+"';";
            String x="update cdet_cr set paddr ='"+getPaddr()+"' where cno='"+getCno()+"';";  
            s.executeUpdate(q);
            s.executeUpdate(r);
            s.executeUpdate(b);
            s.executeUpdate(t);
            s.executeUpdate(u);
            s.executeUpdate(v);
            s.executeUpdate(w);
            s.executeUpdate(x);
            
            JOptionPane.showMessageDialog(null,"Client detail Updated!");
            
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public static LinkedList<Client> retrieveCivilClientDetail(){
        LinkedList<Client> rec=new LinkedList<Client>();
            
        try
        {
            Class.forName("java.sql.DriverManager");
            com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/JustJustice","root","admin123");
            com.mysql.jdbc.Statement s=(com.mysql.jdbc.Statement)con.createStatement();

            String q="select * from cdet_ci;";
            
            ResultSet rs=s.executeQuery(q);
            while(rs.next())
            {
                rec.add(new Client(rs.getString("osno"),rs.getString("cname"),rs.getString("fname"),Long.parseLong(rs.getString("iano")),rs.getString("usec"),rs.getString("mno"),rs.getString("email"),rs.getString("addr"),rs.getString("paddr")));
            }
        
            rs.close();
            con.close();
            s.close();

            JOptionPane.showMessageDialog(null,"Client detail retrieved!");
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rec;
    }
    
    public int compareTo(Client client){
        return (getName().compareTo(client.getName()));
    }
    
    
}
