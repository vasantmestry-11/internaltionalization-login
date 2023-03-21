import React, { Suspense } from "react";
import ReactDOM from "react-dom/client";
import { HashRouter, Routes, Route, Navigate } from "react-router-dom";
import i18n from "i18next";
import { initReactI18next } from "react-i18next";
import LanguageDetector from "i18next-browser-languagedetector";
import Backend from "i18next-http-backend";
import App from "./App";

import "bootstrap/dist/js/bootstrap.js";
import "bootstrap/dist/css/bootstrap.min.css";

import "./index.css";
import Language from "./components/Language/Language";
import Dashboard from "./components/Dashboard/Dashboard";

i18n
  // load translation using http -> see /public/locales (i.e. https://github.com/i18next/react-i18next/tree/master/example/react/public/locales)
  // learn more: https://github.com/i18next/i18next-http-backend
  // want your translations to be loaded from a professional CDN? => https://github.com/locize/react-tutorial#step-2---use-the-locize-cdn
  .use(Backend)
  .use(LanguageDetector) // to detect language of browser
  .use(initReactI18next) // initializes react-i18next
  .init({
    supportedLanguages: ["en"],
    fallbackLng: "en",
    detection: {
      // order and from where user language should be detected. Default cookie name is: i18next
      order: ["path", "cookie", "htmlTag", "localStorage", "sessionStorage"],
      caches: ["cookie"],
    },
    backend: {
      loadPath: "/assets/locales/{{lng}}/translation.json", //path where resources get loaded from
    },
  });

const root = ReactDOM.createRoot(document.getElementById("root"));

const LoadingMarkup = () => (
  <div className="py-4 text-center text-white">
    <h1>Loading...</h1>
  </div>
);

root.render(
  <React.StrictMode>
    <HashRouter>
      <Suspense fallback={<LoadingMarkup />}>
        <Language />
        <Routes>
          <Route exact path="/" element={<App />} />
          <Route exact path="/dashboard" element={<Dashboard />} />
          <Route path="*" element={<Navigate to="/" />} />
        </Routes>
      </Suspense>
    </HashRouter>
  </React.StrictMode>
);
