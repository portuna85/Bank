package ch11.sec03.exam02_hashcode;

public class Key extends Object {
    public String id;

    public Key(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Key.equals");
      if(o instanceof Key) {
          Key key = (Key) o;
          if(this.id == key.id) {
              return true;
          }
      }
      return false;
    }

    @Override
    public int hashCode() {
        System.out.println("해시코드");
        return id.hashCode();
    }
}