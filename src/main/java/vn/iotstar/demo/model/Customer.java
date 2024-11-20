package vn.iotstar.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data // Tạo Getter, Setter, ToString, EqualsAndHashCode
@NoArgsConstructor // Tạo Constructor không tham số
@AllArgsConstructor // Tạo Constructor với tất cả các tham số
@ToString 
@Builder
public class Customer {
	private String id;
	private String name;
	private String phoneNumber;
	private String email;

	
	// Constructor không tham số
    public Customer() {
    }
    
    // Constructor có đầy đủ tham số
    public Customer(String id, String name, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
	 // Getters và Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    public static class CustomerBuilder {
        private String id;
        private String name;
        private String phoneNumber;
        private String email;

        public CustomerBuilder id(String id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public CustomerBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Customer build() {
            return new Customer(id, name, phoneNumber, email);
        }
    }}
