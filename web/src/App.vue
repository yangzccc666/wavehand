<template>
  <div>
        <div>username: {{ username }}</div>
        <div>age: {{ age }}</div>
  </div>

    <NavBar/>
  <router-view/>
</template>

<script>
import NavBar from './components/NavBar.vue'
import { ref } from 'vue';
import $ from 'jquery';

export default {
  name: 'App',
  components: {
    NavBar
  },
  setup() {
    let username = ref('');
    let age = ref('');

    $.ajax({
      url: 'http://localhost:3000/call/index/',
      type: 'GET',
      success: function(data) {
        username.value = data.username;
        age.value = data.age;
      }
    });

    return {
      username,
      age
    }
  }
}
</script>

<style>
body {
  background-color: red;
}
</style>
