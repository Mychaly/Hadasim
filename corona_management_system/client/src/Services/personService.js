import axios from "axios";


const apiUrl = "https://localhost:7069/api/Person";

export default {
  getTasks: async () => {
    const result = await axios.get(`${apiUrl}`);
    return result.data;
  },

  getPerson: async (id) => {console.log("prom")
    const result = await axios.get(`${apiUrl}/` + id);
    
    console.log(result.data.id)
    return result.data;
  },

  addPerson: async (person) => {
    console.log("להוספה הגיעמאחור");
    console.log(person);
    axios
      .post(`${apiUrl}`, {
        id: 0,
        fullName: person.fullName,
        tz: person.tz,
        dateOfBirth: person.dateOfBirth,
        city: person.city,
        street: person.street,
        houseNumber: person.houseNumber,
        phone: person.phone,
        mobilePhone: person.mobilePhone,
      })
      .then((res) => {
        console.log("addTask", person);
      });
    return {};
  },

  updatePerson: async (id, person) => {
    console.log("הגיעמאחור");
    console.log(id);
    console.log(person);
    axios
      .put(`${apiUrl}/` + id, {
        id: 0,
        fullName: person.fullName,
        tz: person.tz,
        dateOfBirth: person.dateOfBirth,
        city: person.city,
        street: person.street,
        houseNumber: person.houseNumber,
        phone: person.phone,
        mobilePhone: person.mobilePhone,
      })
      .then((res) => {
        console.log("updatePerson", person);
      });
    return {};
  },

  deleteTask: async (id) => {
    console.log(id + "למע" + `${apiUrl}/` + id);
    const result = await axios.delete(`${apiUrl}/` + id);
    console.log("deleteTask");
  },

};
