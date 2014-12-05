package Items;


public class Pair<T,U>{
   private T first;//first member of pair
   private U second;//second member of pair

   public Pair(T first, U second){
     this.first = first;
     this.second = second;
   }

   public void setFirst(T first){
    this.first = first;
   }

   public void setSecond(U second) {
     this.second = second;
   }

   public T getFirst() {
     return this.first;
   }

   public U getSecond() {
     return this.second;
   }
}
