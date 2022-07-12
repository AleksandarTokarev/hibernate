package io.nexo.hibernate;


import javax.persistence.*;

@Entity
@Table(name="hibernate_user_attributes  ")
public class UserAttributes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "attr_key", nullable = false)
    private String attributeKey;

    @Column(name = "attr_value", nullable = false)
    private String attributeValue;

//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;

    public UserAttributes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttributeKey() {
        return attributeKey;
    }

    public void setAttributeKey(String attributeKey) {
        this.attributeKey = attributeKey;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}