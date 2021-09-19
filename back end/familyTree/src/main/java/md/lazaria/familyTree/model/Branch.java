package md.lazaria.familyTree.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.TimeZone;
import lombok.Data;


@Data
@Entity
@Table(name = "branches")
public class Branch  implements Serializable {
    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "born_day")
    public int bornDay;

    @Column(name = "born_month")
    public int bornMonth;

    @Column(name = "bornYear")
    public int bornYear;

    @Column(name = "die_day")
    public int dieDay = calendar.get(Calendar.DATE);

    @Column(name = "die_month")
    public int dieMonth = calendar.get(Calendar.MONTH) + 1;

    @Column(name = "die_year")
    public int dieYear = calendar.get(Calendar.YEAR);

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
