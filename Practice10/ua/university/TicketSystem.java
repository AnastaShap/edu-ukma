package ua.university;

public class TicketSystem {

    public String buildTicketId(String base){
        int prefixNumber = 42;

        class IdBuilder{
            public String  generate(){
                return base + " - " +prefixNumber;
            }
        }

        IdBuilder idBuilder = new IdBuilder();
        return idBuilder.generate();

    }

    public Runnable runOnce(){
        return new Runnable(){

            @Override
            public void run() {
                System.out.println("Completed "+Thread.currentThread().getName());
            }
        };
    }
}
