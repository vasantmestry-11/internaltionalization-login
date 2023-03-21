import { useTranslation } from "react-i18next";
import "./Dashboard.css";

const Dashboard = () => {
  const { t } = useTranslation();
  return (
    <div className="container">
      <h1 className="text-white">{t("dashboard")}</h1>
    </div>
  );
};

export default Dashboard;
