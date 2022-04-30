<template>
  <section class="orders-section">
    <div class="mt13 font-family-h2"><h2>Recent Order</h2></div>
    <div class="orders-div">
      <div class="table-titles">
        <p class="ml40">Item Name</p>
        <p>Qty</p>
        <p>Order Date</p>
        <p>Amount</p>
        <p class="mr100">Status</p>
      </div>
      <div class="table-items">
        <div>
          <div class="flex">
            <img class="phone mr10 mt5" src="../assets/Iphine13.png" />
            <h4>Iphone 13</h4>
          </div>
          <div class="flex">
            <img class="phone mr10 mt8" src="../assets/Xiaomi.png" />
            <h4>Xiaomi Redmi Note 10</h4>
          </div>
          <div class="flex">
            <img class="phone mr10 mt8" src="../assets/Iphone14.png" />
            <h4>Iphone 13</h4>
          </div>
        </div>
        <div>
          <div class="mt18"><h4>1</h4></div>
          <div class="mt40"><h4>1</h4></div>
          <div class="mt40"><h4>1</h4></div>
        </div>
        <div class="Order-date-div">
          <div class="mt18"><h4>January 20, 2022</h4></div>
          <div class="mt40"><h4>January 20, 2022</h4></div>
          <div class="mt40"><h4>January 20, 2022</h4></div>
        </div>
        <div>
          <div class="mt18"><h4>$799.00</h4></div>
          <div class="mt40"><h4>$799.00</h4></div>
          <div class="mt40"><h4>$799.00</h4></div>
        </div>
        <div>
          <div class="mt18 status-pending">Pending</div>
          <div class="mt33 status-approved">Approved</div>
          <div class="mt33 status-in-process">In Process</div>
        </div>
      </div>
    </div>
  </section>
</template>
<style>
.displayNone {
  display: none;
}
.font-family-h2 {
  font-family: sans-serif;
}
.flex {
  display: flex;
}
.jbf {
  justify-content: space-between;
}
.jef {
  justify-content: space-around;
}
.Logo {
  margin-left: 50px;
  display: flex;
}
.icon {
  max-width: 26px;
  max-height: 26px;
}
.phone {
  max-width: 40px;
  max-height: 40px;
}
.status-pending {
  font-family: "Renner*";
  font-style: normal;
  font-weight: 700;
  font-size: 16px;
  line-height: 14px;
  text-align: center;
  color: #0561fc;
  background-color: #dff0ff;
  padding-left: 18px;
  padding-right: 18px;
  padding-top: 6px;
  padding-bottom: 6px;
  border-radius: 8px;
}
.status-approved {
  font-family: "Renner*";
  font-style: normal;
  font-weight: 700;
  font-size: 16px;
  line-height: 14px;
  text-align: center;
  color: #78c278;
  background-color: #e6fde6;
  padding-left: 18px;
  padding-right: 18px;
  padding-top: 6px;
  padding-bottom: 6px;
  border-radius: 8px;
}
.status-in-process {
  font-family: "Renner*";
  font-style: normal;
  font-weight: 700;
  font-size: 16px;
  line-height: 14px;
  text-align: center;
  color: #faa86d;
  background-color: #fff4df;
  padding-left: 18px;
  padding-right: 18px;
  padding-top: 6px;
  padding-bottom: 6px;
  border-radius: 8px;
}
.Order-date-div {
  color: #878787;
  font-weight: bold;
}
.table-items {
  margin-top: 20px;
  margin-left: 70px;
  margin-right: 120px;
  display: flex;
  justify-content: space-between;
}
.table-titles {
  background-color: #a6a9aa26;
  border-radius: 13px;
  margin-top: 20px;
  margin-left: 30px;
  display: flex;
  justify-content: space-between;
  color: #878787;
}
.orders-div {
  padding-top: 10px;
  padding-right: 30px;
  background-color: white;
  border-radius: 17px;
}
.orders-section {
  margin-left: 60px;
}
.ChartDiv {
  padding: 7px;
  border-radius: 10px;
  background-color: white;
  margin-bottom: 18px;
}
.AnalyticText {
  font-size: 28px;
  line-height: 22px;
  font-weight: 700;
}
.AnalyticPersentGreen {
  font-family: "Renner*";
  font-style: normal;
  font-weight: 700;
  font-size: 16px;
  line-height: 14px;
  text-align: center;
  color: #65c565;
}
.AnalyticPersentRed {
  font-family: "Renner*";
  font-style: normal;
  font-weight: 700;
  font-size: 16px;
  line-height: 14px;
  text-align: center;
  color: #c56565;
}
.AnalyticPersentGreen-div {
  background-color: #65c5652a;
  margin-left: 8px;
  box-sizing: border-box;
  padding: 5px;
  border-radius: 11px;
}
.AnalyticPersentRed-div {
  background-color: #f4e3e3;
  margin-left: 8px;
  box-sizing: border-box;
  padding: 5px;
  border-radius: 11px;
}
.AnalyticIcon {
  width: 60px;
  height: 60px;
  margin-bottom: 30px;
}
.AnalyticItem {
  color: #aeb9be;
}
.analytics-div {
  background-color: white;
  border-radius: 17px;
  max-height: 270;
  max-width: 400;
}
.analytics-section {
  margin-left: 60px;
}
.UserImg {
  margin-top: 12px;
  margin-left: 15px;
  max-width: 45px;
  max-height: 45px;
  border-radius: 8px;
}
.User {
  display: flex;
  margin-right: 50px;
}
.elips {
  max-width: 13px;
  max-height: 13px;
}
.Topbar {
  margin-bottom: 12px;
  display: flex;
  justify-content: space-between;
}
.Sidbar {
  margin-left: 10px;
  margin-right: 80px;
  max-height: 100%;
  max-width: 100%;
  height: 1200px;
}
.all-analytics {
  display: flex;
  justify-content: space-between;
}
.NavigationBtn {
  display: none;
  margin-top: 10px;
  margin-left: 10px;
  cursor: pointer;
  background-color: #f5f5f5;
  border: none;
}
@media screen and (max-width: 1000px) {
  .Sidbar {
    display: none;
  }
  .mainContent-div {
    box-sizing: border-box;
    padding: 0px;
    height: 100%;
    width: 100%;
  }
  .analytics-section {
    margin-left: 10px;
  }
  .orders-section {
    margin-left: 10px;
  }
  .AnalyticIcon {
    width: 60px;
    height: 60px;
    margin-bottom: 5px;
  }
  .NavigationBtn {
    display: block;
  }
}
.BasketDiv {
  margin-top: 12px;
}
.Basket {
  width: 45px;
  height: 45px;
}
.NotificationDiv {
  margin-top: 12px;
  margin-left: 15px;
}
.Notification {
  width: 45px;
  height: 45px;
}
.SearchDiv {
  background-color: #f8fafb;
  max-width: 850px;
  max-height: 55px;
  border-radius: 8px;
  margin-left: 60px;
}
.Search {
  margin-left: 15px;
  margin-right: 290px;
  background-color: #f8fafb;
  border: none;
}
.SearchImg {
  max-width: 20px;
  max-height: 20px;
  margin-top: 5px;
}
.FocusMenuItem {
  margin-left: 10px;
  color: rgb(0, 81, 255);
  background: rgba(111, 178, 255, 0.336);
  border-radius: 8px;
}
.MenuItem {
  margin-left: 10px;
  color: #aeb9be;
  border-radius: 8px;
}
.MainNav {
  margin-top: 30px;
  margin-left: 20px;
  max-width: 270px;
  max-height: 550px;
}
.ServiceNav {
  margin-left: 20px;
  max-width: 270px;
  max-height: 350px;
}
.mainContent-div {
  box-sizing: border-box;
  padding: 20px;
  height: 100%;
  width: 100%;
}
.white-section {
  background-color: white;
}
.fullbackground {
  background-color: #aeb9be27;
  width: max-content;
}
.full {
  width: 100%;
}
.ml60 {
  margin-left: 60px;
}
.ml40 {
  margin-left: 40px;
}
.ml20 {
  margin-left: 20px;
}
.ml15 {
  margin-left: 15px;
}
.ml10 {
  margin-left: 10px;
}
.ml5 {
  margin-left: 5px;
}
.mt50 {
  margin-top: 50px;
}
.mt40 {
  margin-top: 40px;
}
.mt33 {
  margin-top: 33px;
}
.mt25 {
  margin-top: 25px;
}
.mt20 {
  margin-top: 20px;
}
.mt18 {
  margin-top: 18px;
}
.mt13 {
  margin-top: 13px;
}
.mt8 {
  margin-top: 8px;
}
.mt5 {
  margin-top: 5px;
}
.mb40 {
  margin-bottom: 40px;
}
.mb13 {
  margin-bottom: 13px;
}
.mr200 {
  margin-right: 200px;
}
.mr150 {
  margin-right: 150px;
}
.mr100 {
  margin-right: 100px;
}
.mr50 {
  margin-right: 50px;
}
.mr20 {
  margin-right: 20px;
}
.mr10 {
  margin-right: 10px;
}
.blue {
  color: rgb(0, 81, 255);
}
.black {
  color: black;
}
</style>
