
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lakshmi Priya
 */
public class Citizen extends Person{
    private String uname;
    private String pword;
    private String addr;
    private String occ;
    private String adhaarno;
    
    public Citizen(){}
    
    public Citizen(String uname, String pword)
    {
         this.uname=uname;
         this.pword= pword;
    }

    public Citizen( String name, String uname, String pword, String mno,String addr,  String phno, String occ, String adhaarno, String email, String faxno)
    {
        setUname(uname);
        setPword(pword);
        setName(name);
        setMno(mno);
        this.addr=addr;
        setPhno(phno);
        this.occ=occ;
        this.adhaarno=adhaarno;
        setEmail(email);
        setFaxno(faxno);
    }
      
    String getAddr()
    {
        return addr;
    }
    
    String getOcc()
    {
        return occ;
    }
    
    String getAdhaarno()
    {
        return adhaarno;
    }  
    
    public String getUname()
    {
        return uname;
    }
    
    public String getPword()
    {
        return pword;
    }
    
    public void setUname(String uname)
    {
        this.uname=uname;
    }
    
    public void setPword(String pword)
    {
        this.pword= pword;
    }
    
    void setAddr(String addr)
    {
        this.addr=addr;
    }
    
    void setOcc(String occ)
    {
        this.occ=occ;
    }
    
    void setAdhaarno(String adhaarno)
    {
        this.adhaarno=adhaarno;
    }

    int validateInput() throws IncompleteInputException{
        int flag=1;
        super.validateInput();
        if(getUname().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Username!!"); flag=0;}
        if(getPword().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Password!!"); flag=0;}
        if(getAddr().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Address!!"); flag=0;}
        if(getOcc().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Occupation!!"); flag=0;}
        if(getAdhaarno().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Aadhar number!!"); flag=0;}
        if(flag==0)
            throw new IncompleteInputException();
        return 1;
    }
    
    
}
