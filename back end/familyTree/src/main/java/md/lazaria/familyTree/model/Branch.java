package md.lazaria.familyTree.model;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;
import java.util.Calendar;


@Data
@Entity
@Table(name = "branches")
public class Branch  implements Serializable {
    @Transient
    Calendar calendar = Calendar.getInstance();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBornDay() {
        return bornDay;
    }

    public void setBornDay(int bornDay) {
        this.bornDay = bornDay;
    }

    public int getBornMonth() {
        return bornMonth;
    }

    public void setBornMonth(int bornMonth) {
        this.bornMonth = bornMonth;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public int getDieDay() {
        return dieDay;
    }

    public void setDieDay(int dieDay) {
        this.dieDay = dieDay;
    }

    public int getDieMonth() {
        return dieMonth;
    }

    public void setDieMonth(int dieMonth) {
        this.dieMonth = dieMonth;
    }

    public int getDieYear() {
        return dieYear;
    }

    public void setDieYear(int dieYear) {
        this.dieYear = dieYear;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Column(name = "first_name")
    public String firstName;

    @Column(name = "last_name")
    public String lastName;

    @Column(name = "born_day")
    public int bornDay;

    @Column(name = "born_month")
    public int bornMonth;

    @Column(name = "bornYear")
    public int bornYear;

    @Column(name = "die_day")
    public int dieDay  = calendar.get(Calendar.DATE);

    @Column(name = "die_month")
    public int dieMonth  = calendar.get(Calendar.MONTH) + 1;

    @Column(name = "die_year")
    public int dieYear  = calendar.get(Calendar.YEAR);

    @Column(name = "info")
    public String info;

    @Column(name = "photo")
    public String photo;

    @Column(name = "descr")
    public String descr;

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bornDay='" + bornDay + '\'' +
                ", bornMonth='" + bornMonth + '\'' +
                ", bornYear='" + bornYear + '\'' +
                ", dieDay='" + dieDay + '\'' +
                ", dieMonth='" + dieMonth + '\'' +
                ", dieYear='" + dieYear + '\'' +
                ", info='" + info + '\'' +
                ", photo='" + photo + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
