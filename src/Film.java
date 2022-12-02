
public class Film {

    String name;
    int duration;
    int imdbResponseCount;
    private String description;
    private int yearReleased;
    private double imdbRating;
    private String director;
    private String roles;

    static int totalWievs;

    protected String genre;

    protected int budget;

    public Film() {
    }

    public Film(String description, int yearReleased, double imdbRating, String director) {
        this.description = description;
        this.yearReleased = yearReleased;
        this.imdbRating = imdbRating;
        this.director = director;
    }

    public Film(String name, int duration, int imdbResponseCount, String description, int yearReleased,
                double imdbRating, String director, String roles, String genre, int budget) {
        this.name = name;
        this.duration = duration;
        this.imdbResponseCount = imdbResponseCount;
        this.description = description;
        this.yearReleased = yearReleased;
        this.imdbRating = imdbRating;
        this.director = director;
        this.roles = roles;
        this.genre = genre;
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", imdbResponseCount=" + imdbResponseCount +
                ", description='" + description + '\'' +
                ", yearReleased=" + yearReleased +
                ", imdbRating=" + imdbRating +
                ", director='" + director + '\'' +
                ", roles='" + roles + '\'' +
                ", genre='" + genre + '\'' +
                ", budget=" + budget +
                '}';
    }
    public static void printStaticTotalWievs(){
        System.out.println(totalWievs);
    }
    public void printTotalWievs(){
        System.out.println(totalWievs);
    }
    public void resetValues(String name, int duration, int imdbResponseCount, String description, int yearReleased,
                            double imdbRating, String director, String roles, String genre, int budget){
        this.name = name;
        this.duration = duration;
        this.imdbResponseCount = imdbResponseCount;
        this.description = description;
        this.yearReleased = yearReleased;
        this.imdbRating = imdbRating;
        this.director = director;
        this.roles = roles;
        this.genre = genre;
        this.budget = budget;
    }

    public static void main(String[] args) {
        Film f1 = new Film();
        System.out.println(f1.toString());
        Film f2 = new Film("Great movie", 2020, 7.8, "John Doe");
        System.out.println(f2.toString());
        Film f3 = new Film("Movie", 123, 5555, "Film about things", 2020, 9.9, "Director", "rolerolerole",
                "Thriller", 999999);
        System.out.println(f3.toString());
        Film.printStaticTotalWievs();
        f1.printTotalWievs();

    }


}
