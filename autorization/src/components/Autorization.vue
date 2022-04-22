<template>
  <section id="app" class="flex">
    <div><img src="../assets/logo.png" /></div>
    <div>
      <div class="imput-desk">
        <div class="flex text-imput">
          <h1 class="mr10 mt8 mb8">Login</h1>
          <input id="login" class="input" type="text" />
        </div>
        <div class="flex text-imput">
          <h1 class="mr10 mt8 mb8">Password</h1>
          <input id="password" class="input" type="password" />
        </div>
      </div>
      <div class="imput-mobil">
        <div class="flex text-imput">
          <input placeholder="Login" class="input mr10 mt8 mb8" type="text" />
        </div>
        <div class="flex text-imput">
          <input placeholder="Password" class="input mr10 mt8 mb8" type="password" />
        </div>
      </div>
      <div class="checkbox-imput">
        <input class="checkbox mr10 mt8 mb8" type="checkbox" unchecked />
        <label class="">Запомнить</label>
      </div>
      <div id="button-div">
        <button v-on:click="signIn" class="button-3" role="button">Login</button>
      </div>
    </div>
  </section>
</template>

<script lang="ts">
import { Component, Vue } from "vue-property-decorator";

import axios from "axios";

export default {
  methods: {
    signIn() {
      const log: HTMLInputElement = document.getElementById("login") as HTMLInputElement;
      const password: HTMLInputElement = document.getElementById("password") as HTMLInputElement;

      const config = {
        url: "http://localhost:8080/v1/user/login",
      };
      const data = {
        login: log.value,
        password: password.value,
      };
      const headers = {
        "Content-Type": "application/json",
        "x-mock-match-request-body": "true",
      };
      axios
        .post(config.url, data, { headers })
        .then((response) => {
          console.log(response.data);
          if (response.data.verification) {
            alert("Вход прошёл успешно!");
          } else {
            alert("Неверный логин или пароль!");
          }
        })
        .catch((error) => {
          console.log(error);
          alert("Неверный логин или пароль!");
        });
    },
  },
};
</script>

<style>
#app {
  justify-content: center;
  align-items: center;
  display: flex;
}
#button-div {
  display: flex;
  justify-content: center;
}
.imput-mobil {
  display: none;
}

.input {
  max-width: 200px;
  height: 50%;
}
.text-imput {
  width: 300px;
  align-items: center;
  justify-content: space-between;
}
.mb8 {
  margin-bottom: 8px;
}
.checkbox-imput {
  align-items: center;
}
@media screen and (max-width: 1200px) {
  .checkbox-imput {
    justify-content: center;
    display: flex;
  }
  .imput-mobil {
    display: block;
  }
  .imput-desk {
    display: none;
  }
}
.checkbox {
  width: 17px;
  height: 17px;
}
.mt8 {
  margin-top: 8px;
}
.jbf {
  justify-content: space-between;
}
.flex {
  display: flex;
  flex-direction: row;
}
@media screen and (max-width: 1200px) {
  .flex {
    flex-direction: column;
  }
}
.mr10 {
  margin-right: 12px;
}

/* CSS */
.button-3 {
  appearance: none;
  background-color: #2ea44f;
  border: 1px solid rgba(27, 31, 35, 0.15);
  border-radius: 6px;
  box-shadow: rgba(27, 31, 35, 0.1) 0 1px 0;
  box-sizing: border-box;
  color: #fff;
  cursor: pointer;
  display: inline-block;
  font-family: -apple-system, system-ui, "Segoe UI", Helvetica, Arial, sans-serif,
    "Apple Color Emoji", "Segoe UI Emoji";
  font-size: 14px;
  font-weight: 600;
  line-height: 20px;
  padding: 6px 16px;
  position: relative;
  text-align: center;
  text-decoration: none;
  user-select: none;
  -webkit-user-select: none;
  touch-action: manipulation;
  vertical-align: middle;
  white-space: nowrap;
}

.button-3:focus:not(:focus-visible):not(.focus-visible) {
  box-shadow: none;
  outline: none;
}

.button-3:hover {
  background-color: #2c974b;
}

.button-3:focus {
  box-shadow: rgba(46, 164, 79, 0.4) 0 0 0 3px;
  outline: none;
}

.button-3:disabled {
  background-color: #94d3a2;
  border-color: rgba(27, 31, 35, 0.1);
  color: rgba(255, 255, 255, 0.8);
  cursor: default;
}

.button-3:active {
  background-color: #298e46;
  box-shadow: rgba(20, 70, 32, 0.2) 0 1px 0 inset;
}
</style>
