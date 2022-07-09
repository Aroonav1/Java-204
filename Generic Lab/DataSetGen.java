/**
 * Create a generic class, DataSetGen using 
 * <Measurable> to instantiate a generic interface
*/
public class DataSetGen <A extends Measurable> 
{
   private double sum;
   private A maximum;
   private double count;


   /**
    * Constructor for an empty data set.
   */
   public DataSetGen()
   {
	  sum = 0;
      count = 0;
      maximum = null;
   }

   /**
    * Adds a data value to the data set.
    * @param x a data value
   */
   public void add (A x) // how to define a generic non-static method??
   {
	sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      count++;
   }

   /**
    * Gets the average of the added data.
    * @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum/count;
   }

   /**
    * Gets the largest of the added data.
    * @return the associated measurable object, maximum, 
    * or 0 if no data has been added
   */
   public A getMaximum()
   {
      return maximum;
   }
}