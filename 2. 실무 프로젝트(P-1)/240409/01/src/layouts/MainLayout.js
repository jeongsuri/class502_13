import React from "react";
import { Outlet, NavLink } from "react-router-dom";
import classNames from "classnames";
const MainLayout = () => {
  return (
    <>
      <header>
        <h1>header</h1>
        <div>
          <NavLink
            to="/about"
            className={({ isActive }) => classNames("menu", { on: isActive })}
          >
            About
          </NavLink>
          <NavLink
            to="/board"
            className={({ isActive }) => classNames("menu", { on: isActive })}
          >
            Board
          </NavLink>
        </div>
      </header>
      <main>
        <Outlet />
      </main>
      <footer>
        <h1>footer</h1>
      </footer>
    </>
  );
};
export default React.memo(MainLayout);
