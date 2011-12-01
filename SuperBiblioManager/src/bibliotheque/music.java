package bibliotheque;

public class music extends multimedia
{
    public String recordLabel;
    
    public music(String title1, String author1, String time1, String typeMultimedia1, String recordLabel)
    {
        super(title1,author1,time1,typeMultimedia1);
        setRecordLabel(recordLabel);
    }

    @Override
    public String getRecordLabel()
    {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel)
    {
        this.recordLabel = recordLabel;
    }
}