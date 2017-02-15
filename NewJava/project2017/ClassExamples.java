class Person {

    private int personId;
    private String jobDescription;

    public Person(int personId, String jobDescription) {
        super();
        this.personId = personId;
        this.jobDescription = jobDescription;
    }

    //..
}

class Job {

    private int personId;
    private String description;

    public Job(int personId, String description) {
        super();
        this.personId = personId;
        this.description = description;
    }

    //..

}

Function<Person, Job> mapPersonToJob = new Function<Person, Job>() {
    public Job apply(Person person) {
        Job job = new Job(person.getPersonId(), person.getJobDescription());
        return job;
    }
};


 public static double quadratic(double a, double b, double c, int polarity) {

    double x = b*b - 4*a*c;

    // When x < 0, Math.sqrt(x) retruns NaN
    if (x < 0) {
      /*
        throw exception!
        I understand this code can be adjusted to accommodate 
        imaginary numbers, but for the sake of this example,
        let's just have this function throw an exception and
        say the coefficients are invalid
      */
    }

    return (-b + Math.sqrt(x) * polarity) / (2*a);

  }

}