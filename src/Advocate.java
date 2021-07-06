
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
public class Advocate extends Person{
    private String uname;
    private String pword;
    private String oaddr;
    private String branch;
    private String bassn;
    private String enrolno;
    private String caddr;
    private String raddr;
    
    public Advocate(){}
    
    public Advocate(String uname, String pword)
    {
         this.uname=uname;
         this.pword= pword;
    }
    
    public Advocate(  String uname, String name, String pword, String mno, String oaddr, String branch, String bassn, String enrolno, String phno, String email, String faxno, String caddr, String raddr)
    {
        setUname(uname);
        setPword(pword);
        setName(name);
        setMno(mno);
        setPhno(phno);
        setEmail(email);
        setFaxno(faxno);
        this.oaddr=oaddr;
        this.branch=branch;
        this.bassn=bassn;
        this.enrolno=enrolno;
        this.caddr=caddr;
        this.raddr=raddr;
    }
    String getOaddr()
    {
        return oaddr;
    }
    
    String getBranch()
    {
        return branch;
    }
    
    String getBassn()
    {
        return bassn;
    }
    
    String getEnrolno()
    {
        return enrolno;      
    }
    
    String getCaddr()
    {
        return caddr;
    }
    
    String getRaddr()
    {
        return raddr;
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
    
    void setOaddr(String oaddr)
    {
        this.oaddr=oaddr;
    }
    
    void setBranch(String branch)
    {
        this.branch=branch;
    }
    
    void setBassn(String bassn)
    {
        this.bassn=bassn;
    }
    
    void setEnrolno(String enrolno)
    {
        this.enrolno=enrolno;      
    }
    
    void setCaddr(String caddr)
    {
        this.caddr=caddr;
    }
    
    void setRaddr(String raddr)
    {
        this.raddr=raddr;
    }
    
    int validateInput() throws IncompleteInputException{
        int flag=1;
        //super.validateInput();
        if(getUname().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Username!!"); flag=0;}
        if(getPword().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Password!!"); flag=0;}
        if(getOaddr().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Address!!"); flag=0;}
        if(getBassn().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Bar Association Number!!"); flag=0;}
        if(getBranch().isEmpty())
        {JOptionPane.showMessageDialog(null,"Enter Branch!!"); flag=0;}
        if(getEnrolno().length()==0)
        {JOptionPane.showMessageDialog(null,"Invalid Enrolment Number!!"); flag=0;}
        if(getCaddr().length()==0)
        {JOptionPane.showMessageDialog(null,"Invalid Court Address!!"); flag=0;}
        if(getRaddr().length()==0)
        {JOptionPane.showMessageDialog(null,"Invalid Residential Address!!"); flag=0;}
        if(flag==0)
            throw new IncompleteInputException();
        return 1;
    }
}
