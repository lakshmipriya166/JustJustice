
import javax.swing.JOptionPane;


/**
 *
 * @author Lakshmi Priya
 */
public class Person
{
    private String name;
    private String mno;
    private String phno;
    private String email;
    private String faxno;
    
    public Person(){}
    
    public Person(String name, String mno, String email){
        this.name=name;
        this.mno=mno;
        this.phno=phno;
        this.email=email;
        this.faxno=faxno;
    }
    
    public Person(String name, String mno, String phno, String email, String faxno){
        this.name=name;
        this.mno=mno;
        this.phno=phno;
        this.email=email;
        this.faxno=faxno;
    }
    
     String getPhno()
    {
        return phno;   
    }
     
    void setEmail(String email)
    {
        this.email=email;
    }
    
     void setFaxno(String faxno)
    {
        this.faxno=faxno;
    }
     
    void setPhno(String phno)
    {
        this.phno=phno;    
    }
    
    String getEmail()
    {
        return email;
    }
    
    String getFaxno()
    {
        return faxno;
    }
    
    void setName(String name)
    {
        this.name=name;
    }
    
    void setMno(String mno)
    {
        this.mno=mno;
    }
    
    String getName()
    {
        return name;
    }
    
    String getMno()
    {
        return mno;
    }
     
    int validateInput() throws IncompleteInputException{
        int flag=1;
        if(getName().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter name!!"); flag=0;}
        if(getMno().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Mobile Number!!"); flag=0;}
        if(getPhno().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Phone Number!!"); flag=0;}
        if(getEmail().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Email Id!!"); flag=0;}
        if(getFaxno().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Fax number!!"); flag=0;}
        if(flag==0)
            throw new IncompleteInputException();
        return 1;
    }
    
    
}

