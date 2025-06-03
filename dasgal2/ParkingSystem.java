package  dasgal;

class ParkingSystem {
   public int big = 0;
   public int medium = 0;
   public int small = 0;

   public ParkingSystem(int var1, int var2, int var3) {
      this.big = var1;
      this.medium = var2;
      this.small = var3;
   }

   public boolean addCar(int var1) {
      if (var1 == 1 && this.big > 0) {
         --this.big;
         return true;
      } else if (var1 == 2 && this.medium > 0) {
         --this.medium;
         return true;
      } else if (var1 == 3 && this.small > 0) {
         --this.small;
         return true;
      } else {
         return false;
      }
   }
}
