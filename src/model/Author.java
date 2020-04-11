package model;

public class Author {
    private String name;
    private String surname;
    private String email;
    private String genrer;

    public Author(String name, String surname, String email, String genrer) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.genrer = genrer;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenrer() {
        return genrer;
    }

    public void setGenrer(String genrer) {
        this.genrer = genrer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (name != null ? !name.equals(author.name) : author.name != null) return false;
        if (surname != null ? !surname.equals(author.surname) : author.surname != null) return false;
        if (email != null ? !email.equals(author.email) : author.email != null) return false;
        return genrer != null ? genrer.equals(author.genrer) : author.genrer == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (genrer != null ? genrer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", genrer='" + genrer + '\'' +
                '}';
    }
}
