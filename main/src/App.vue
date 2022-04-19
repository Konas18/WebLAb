<template>
  <div class="full">
    <Fio lastName="Заболотский" firstName="Александр" middleName="Николаевич"></Fio>
    <Vyatsu class="full mt20" :results="results"></Vyatsu>
    <Autorization class="mt20"></Autorization>
    <Registration class="mt20"></Registration>
    <Table class="mt20"></Table>
  </div>
</template>

<script lang="ts">
import Vue from "vue";
import axios from "axios";
import Fio from "../../fio/src/components/Fio.vue";
import Vyatsu from "../../vyatsu/src/components/Vyatsu.vue";
import Autorization from "../../autorization/src/components/Autorization.vue";
import Registration from "../../registration/src/components/Registration.vue";
import Table from "../../table/src/components/Table.vue";

const config = {
  headers: {
    "Access-Control-Allow-Origin": "https://www.vyatsu.ru",
  },
};

const url = "https://www.vyatsu.ru";

// const url = "http://127.0.0.1:5500/main/src/components/8.Html";
//  в cmd написать "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe"
// --disable-web-security --disable-gpu --allow-file-access-from-files --user-data-dir=C:\temp\

export default Vue.extend({
  name: "App",
  components: {
    Fio,
    Vyatsu,
    Autorization,
    Registration,
    Table,
  },
  data() {
    return { results: [] };
  },
  mounted() {
    axios
      .get(url, config)
      .then((response: any) => {
        this.results = response.data;
      })
      .catch((error: any) => console.log(error));
  },
});
</script>
<style>
.mt20 {
  margin-top: 20px;
}
</style>
