
/**
 * Write a description of class RecordCompany here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordCompany
{
    Band myBand;

    public RecordCompany(Band t)
    {
        myBand = t;	
    }

    public Band getBand()
    {
        return myBand;
    }

    public String getAlbum()
    {
        return myBand.getAlbum();    
    }

    public void changeAlbum(String x)
    { 
        myBand.changeAlbum(x); 
    }
}
