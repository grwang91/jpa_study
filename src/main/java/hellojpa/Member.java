package hellojpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "MEMBER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "name")
    private String username;

    @OneToMany(mappedBy = "member")
    List<Orders> orders = new ArrayList<>();

    private String city;

    private String zipcode;

//    public void addOrder(Order order) {
//        this.getOrders().add(order);
//        order.setMember(this);
//    }

}
