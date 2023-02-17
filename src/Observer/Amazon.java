package Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    private static Amazon instance=null;
    private List<SubScriberParent> subScriberParents;
    private Amazon()
    {
       subScriberParents=new ArrayList<>();
    }
    public static Amazon getInstance()
    {
        if(instance==null)
        {
            synchronized (Amazon.class)
            {
               if(instance==null)
               {
                   instance=new Amazon();
               }

            }
        }
        return instance;
    }
    public void registerSubscriber(SubScriberParent subScriberParent)
    {
        subScriberParents.add(subScriberParent);
    }
    public void unRegisterSubscriber(SubScriberParent subScriberParent)
    {
        subScriberParents.remove(subScriberParent);
    }

    public void notifySubscriber()
    {
        for(SubScriberParent subScriberParent: subScriberParents)
        {
            subScriberParent.orderPlaced();
        }
    }

}
