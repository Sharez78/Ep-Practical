package one;

public class Student 
{
 private int id;
 private int regno;
 public int getRegno() {
  return regno;
 }
 public void setRegno(int regno) {
  this.regno = regno;
 }
 private String name,password,email,branch,city;
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 public String getPassword() {
  return password;
 }
 public void setPassword(String password) {
  this.password = password;
 }
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public String getBranch() {
  return branch;
 }
 public void setBranch(String branch) {
  this.branch = branch;
 }
 public String getCity() {
  return city;
 }
 public void setCity(String city) {
  this.city = city;
 }
}