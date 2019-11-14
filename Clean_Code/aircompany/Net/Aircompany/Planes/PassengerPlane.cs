using System;

namespace Aircompany.Planes
{
    public class PassengerPlane : Plane
    {
        public int PassengersCapacity { get; private set; }

        public PassengerPlane(string model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity)
            :base(model, maxSpeed, maxFlightDistance, maxLoadCapacity)
        {
            this.PassengersCapacity = passengersCapacity;
        }

        public override bool Equals(object objectToCompare)
        {
            return (objectToCompare as PassengerPlane) != null &&
                   base.Equals(objectToCompare) &&
                   PassengersCapacity == (objectToCompare as PassengerPlane).PassengersCapacity;
        }

        public override int GetHashCode()
        {
            var hashCode = 751774561;
            return (hashCode * -1521134295 + base.GetHashCode())
                * hashCode * -1521134295 + PassengersCapacity.GetHashCode();
        }

        public int GetPassengersCapacityIs()
        {
            return PassengersCapacity;
        }

       
        public override string ToString()
        {
            return base.ToString().Replace("}",", passengersCapacity=" + PassengersCapacity + '}');
        }       
    }
}
