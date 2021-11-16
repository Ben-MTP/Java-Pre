## Concept:
1. Thread và xử lý đa luồng trong Java

2. Kiến thức nâng cao - ThreadPoolExecutor

10.3.9.63:1521
select * from SHOP_STOCK;
select * from STOCK_GOOD_SERIAL;

SELECT b.center_code, COUNT (b.center_code) total    
FROM stock_good_serial a, shop_stock b   
WHERE a.stock_id = b.stock_id AND a.serial >= '8401020601718426' AND a.serial<= '8401020601718499'
GROUP BY b.center_code;


## Schema
Table theo schema
Hiện table theo schema


## Function
public boolean validBHTT(String strCTKV, String from_sernum, String to_sernum) throws Exception {
    ResultSet rsCheck = null;
    PreparedStatement stmtCheck = null;
    boolean blnValidate = false;
    try {
      String strSQL_Check = " SELECT b.center_code, COUNT (b.center_code) total    FROM sm_owner.stock_good_serial@db_lnk_bhtt a, shop_stock@db_lnk_bhtt b   WHERE     a.stock_id = b.stock_id         AND serial >= '" + 
        
        from_sernum + "' AND serial<= '" + to_sernum + "' " + 
        " GROUP BY b.center_code ";
      stmtCheck = this.mcnMain.prepareStatement(strSQL_Check);
      rsCheck = stmtCheck.executeQuery();
      while (rsCheck.next()) {
        String strCENTER_CODE = rsCheck.getString("center_code");
        if (strCTKV.indexOf(strCENTER_CODE) > 0) {
          blnValidate = true;
          continue;
        } 
        blnValidate = false;
        break;
      } 
      return blnValidate;
    } catch (Exception ex1) {
      ex1.printStackTrace();
      throw ex1;
    } 
  }
  