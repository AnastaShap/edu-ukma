package ua.university.task1;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Library {
    private String name;

    @AllArgsConstructor
    public class Book{
        private String title;
        private String author;
        public String bookLabel(){
            return "Library name: " + Library.this.name;
        }


    }
}
