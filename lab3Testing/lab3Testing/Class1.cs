using System;
using System.Diagnostics;

namespace lab3Testing
{
    public class Class1
    {
        public bool IsTriangleExists(double a, double b, double c)
        {
            if(a == 0 || b == 0 || c == 0)
            {
                return false;
            }
            if(a <0 || b < 0 || c <0)
            {
                return false;
            }
            double[] values = new double[] { a, b, c };
            bool flag = false;

            while(!flag)
            {
                flag = true;
                for(int i = 0; i < values.Length; i++)
                {
                    if (i != values.Length - 1)
                    {
                        if (values[i] > values[i + 1])
                        {
                            double temp = values[i];
                            values[i] = values[i + 1];
                            values[i + 1] = temp;
                            flag = false;
                        }
                    }
                }
            }
            Console.WriteLine(values);

            Trace.Write(values);
            if (values[0] + values[1] >= values[2])
            {
                return true;
            }
            
            else
            {
                return false;
            }
        }
    }
}
