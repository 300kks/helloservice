-- ----------------------------
-- Table structure for messages
-- ----------------------------
CREATE TABLE IF NOT EXISTS messages (
    id SERIAL PRIMARY KEY,
    message VARCHAR(255)
);
COMMENT ON TABLE messages IS 'Messages table';
