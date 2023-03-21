const formReducer = (state, action) => {
  switch (action.type) {
    case "INPUT_CHANGE":
      return {
        ...state,
        [action.field]: action.payload,
      };
    default:
      return state;
  }
};

export default formReducer;
