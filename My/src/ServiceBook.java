import java.util.ArrayList;
import java.util.Date;

public class ServiceBook
{
   private ArrayList<Service> serviceList;

   public ServiceBook()
   {
      serviceList = new ArrayList<Service>();
   }

   public void addService(Service service)
   {
      serviceList.add(service);

   }

   public int getNumberOfServices()
   {
      return serviceList.size();
   }

   public ArrayList<Integer> getAllServiceMilages()
   {
      ArrayList<Integer> milages = new ArrayList<Integer>();
      // for (i=0 ; i<serviceList.size()i++;

      for (Service service : serviceList)
      {
         milages.add(service.getMileage());
      }

      return milages;
   }

   public Service getService(int index)
   {
      return serviceList.get(index);
   }

   public ArrayList<Service> getAllServices()
   {
      return serviceList;
   }

   public Boolean hasServiceOnDate(Object obj)
   {

      for (Service service : serviceList)
      {
         if (service.getDate().equals(obj))
            return true;
      }

      {

         return false;
      }
   }

   public Date getDateOfLastService()
   {
      return serviceList.get(serviceList.size() - 1).getDate();
   }

}
